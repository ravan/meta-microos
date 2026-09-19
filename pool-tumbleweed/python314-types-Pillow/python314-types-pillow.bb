SUMMARY = "Typing stubs for Pillow"
DESCRIPTION = "Typing stubs for Pillow"
LICENSE = "Apache-2.0"

PV = "10.2.0.20240822"

RPM_NAME = "python314-types-Pillow-10.2.0.20240822-2.5.noarch.rpm"
RPM_HASH = "3dc0d11156f9cdf3886b63b5de48e73077bcad6c56d46b148c633142496bc46e438ec67c2a21e9cf451286f48bd6d99186d9abe2a7ca55774bda72708badba75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-types-pillow \
python314-types-Pillow \
python3dist-types-pillow"

RDEPENDS:${PN} += ""

inherit rpm
