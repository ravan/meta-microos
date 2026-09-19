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

RPM_NAME = "python313-defusedxml-0.7.1-4.5.noarch.rpm"
RPM_HASH = "2fb7e873478731b90b351aa7314a6ef872ef317ee0e5fb9317157f61faaaedd42205ff92bb8252d6450fb8a97aad25d1bc03e9994c60d6569d8d51c53bc6d333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-defusedxml \
python3.13dist-defusedxml \
python313-defusedxml \
python3dist-defusedxml"

RDEPENDS:${PN} += "python-abi \
python313-xml"

inherit rpm
