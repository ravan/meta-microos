SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.2.22"

RPM_NAME = "jsch-javadoc-0.2.22-1.7.noarch.rpm"
RPM_HASH = "fe3fbf34a6099df18d7a0cf19b172fe4ce0229d6e7573c7545909707bf0cd0f47017b9d2fdc044b5fa6dd20c32bdfabc35b27685d0fcd7a067d19677ff168d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
