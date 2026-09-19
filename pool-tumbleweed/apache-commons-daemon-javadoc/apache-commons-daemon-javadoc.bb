SUMMARY = "Commons Daemon Javadoc"
DESCRIPTION = "The Javadoc Documentation for Commons Daemon."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "apache-commons-daemon-javadoc-1.6.1-1.3.noarch.rpm"
RPM_HASH = "81c0dbe03e262f594b99545cc95574f04f68550c7e54133e8cd3e671a61f5766c0bcd549641f59666b6658349b78dce11ac1b2ba7aa3c671bc0270a91072d5b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-daemon-javadoc \
jakarta-commons-daemon-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
