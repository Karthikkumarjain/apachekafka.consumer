FROM ubuntu:latest
LABEL authors="karthik.kumarb"

ENTRYPOINT ["top", "-b"]