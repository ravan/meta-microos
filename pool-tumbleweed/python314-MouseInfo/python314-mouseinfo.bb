SUMMARY = "Display XY position and RGB color information for pixels"
DESCRIPTION = "This application to display XY position and RGB color information for the pixel \
currently under the mouse. Works on Python 2 and 3. This is useful for GUI \
automation planning."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "python314-MouseInfo-0.1.3-2.5.noarch.rpm"
RPM_HASH = "e0e9ecc36b17436463698ca8b4c7aeef880d63efcb4d6d844794d43994793256d199c5da6e5b7809d53ec9a39fe9be69770ed2f8192f1d6163a8e2388f89fd4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mouseinfo \
python314-MouseInfo \
python3dist-mouseinfo"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-pyperclip"

inherit rpm
