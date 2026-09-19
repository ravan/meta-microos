SUMMARY = "Tool to help creating Talos kubernetes cluster"
DESCRIPTION = "The main reason of this tool is to help creating Talos cluster in GitOps way. \
Inspired by a python script written by @bjw-s. \
 \
You can use this tool to generate Talos config file with talhelper genconfig \
command. You can also use this tool to generate Talos secrets with talhelper \
gensecret command."
LICENSE = "BSD-3-Clause"

PV = "3.1.17"

RPM_NAME = "talhelper-3.1.17-1.1.aarch64.rpm"
RPM_HASH = "8d8f696eeb02b4215513c20b4abc79b027bfd4a5ec9cd0dd2fdef08e367152a6e8c2d3ed3ca6a709ab81ee96f0cdee97dfdbfc32ea447565299925c46b6b9249"

RPROVIDES:${PN} += "talhelper"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
