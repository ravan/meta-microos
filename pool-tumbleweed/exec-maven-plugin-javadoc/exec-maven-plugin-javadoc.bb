SUMMARY = "Javadoc for exec-maven-plugin"
DESCRIPTION = "API documentation for exec-maven-plugin."
LICENSE = "Apache-2.0"

PV = "3.6.3"

RPM_NAME = "exec-maven-plugin-javadoc-3.6.3-1.2.noarch.rpm"
RPM_HASH = "5ca486156e4334da4d91ad649a466e017e549399a1748c107ef38a1f1fab2b5ae0a0cc8836a411fc2ed7d9bc36cd98ef291aa33936800774160f01ec61ef4577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exec-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
