FROM ubuntu:14.04
MAINTAINER Sundar Rajan <bphalak@cisco.com>

RUN echo “#!/bin/sh\n” > /test.sh
RUN echo “echo \”this is version 1\”” >> /test.sh
ENTRYPOINT [“sh”, “/test.sh”]
