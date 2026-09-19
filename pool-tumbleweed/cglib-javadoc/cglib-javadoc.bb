SUMMARY = "Code Generation Library"
DESCRIPTION = "cglib is a powerful, high performance and quality Code Generation \
Library, It is used to extend JAVA classes and implements interfaces at \
runtime."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "cglib-javadoc-3.3.0-5.12.noarch.rpm"
RPM_HASH = "4c65fcbd7307d6b4a088fff00331eeba59f16e5df640f6faccbe5b99fb6827a2b458187ab9e5adfd58e00e7fa8f5153df696d43d5a5513512006508c13911eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cglib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
