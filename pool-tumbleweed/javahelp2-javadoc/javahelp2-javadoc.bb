SUMMARY = "Java online help system"
DESCRIPTION = "JavaHelp software is a full-featured, platform-independent, extensible \
help system that enables developers and authors to incorporate online \
help in applets, components, applications, operating systems, and \
devices. Authors can also use the JavaHelp software to deliver online \
documentation for the Web and corporate Intranet."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.05"

RPM_NAME = "javahelp2-javadoc-2.0.05-32.17.noarch.rpm"
RPM_HASH = "a27cb09662bfe6e45786b42def74333211e52d9a453d20ff0297d8163f999ae2d8de0cbfad885981b4821d035e6d7bd78bb1f5472d8da8be1641ba35fae34aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javahelp2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
