SUMMARY = "Python wrapper for OCR engines"
DESCRIPTION = "PyOCR is an optical character recognition (OCR) tool wrapper for python. \
That is, it helps using various OCR tools from a Python program."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.5"

RPM_NAME = "python314-pyocr-0.8.5-1.13.noarch.rpm"
RPM_HASH = "dfe4532abd75c79785881c87f5540840c47b38b275d76211ce4335665f326679113f832edd193876d51bf2dff147167535c1ca2b559cf5d87aa8223c062cb94a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyocr \
python314-pyocr \
python3dist-pyocr"

RDEPENDS:${PN} += "python-abi \
python314-Pillow"

inherit rpm
