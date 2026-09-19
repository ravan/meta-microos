SUMMARY = "A backport of Python 3.10's inspectget_annotation() function"
DESCRIPTION = "A backport of Python 3.10's inspectget_annotation() function."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-get-annotations-0.1.2-1.11.noarch.rpm"
RPM_HASH = "53978b85dd321cef603474dfbeec66ea16c131e7cecc94714df4d37601519c6b922d2101b9e87338dbe4ff8a4923cd67f998720773ee32b3a6895ff1a7593b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-get-annotations \
python314-get-annotations \
python3dist-get-annotations"

RDEPENDS:${PN} += "python-abi"

inherit rpm
