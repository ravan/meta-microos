SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.2.22"

RPM_NAME = "jsch-demo-0.2.22-1.7.noarch.rpm"
RPM_HASH = "2b579dfea41b0e10fdad1039e209e48c368a950cfc888745e3337fcbc97fb142ba4f51744b2d1d6d9974a03e6bb8e660e8376ab415c3a96097e4d7878a29c4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-demo"

RDEPENDS:${PN} += ""

inherit rpm
