SUMMARY = "XML bomb protection for Python stdlib modules"
DESCRIPTION = "The results of an attack on a vulnerable XML library can be fairly dramatic. \
With just a few hundred bytes of XML data an attacker can occupy several \
gigabytes of memory within seconds. An attacker can also keep \
CPUs busy for a long time with a small to medium size request. \
 \
This library allows for XML to be parsed in a manner that avoids these \
pitfalls."
LICENSE = "Python-2.0"

PV = "0.7.1"

RPM_NAME = "python314-defusedxml-0.7.1-4.5.noarch.rpm"
RPM_HASH = "cf665f650b8687c5b46e433742ecea21e83c568583a40b3d7459e3f1c991981d847f7f60439284eacb8220daad35500b4f8efad6c91c389c1b764f2326893927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-defusedxml \
python314-defusedxml \
python3dist-defusedxml"

RDEPENDS:${PN} += "python-abi \
python314-xml"

inherit rpm
