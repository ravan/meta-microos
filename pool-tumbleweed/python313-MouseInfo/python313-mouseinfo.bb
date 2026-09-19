SUMMARY = "Display XY position and RGB color information for pixels"
DESCRIPTION = "This application to display XY position and RGB color information for the pixel \
currently under the mouse. Works on Python 2 and 3. This is useful for GUI \
automation planning."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "python313-MouseInfo-0.1.3-2.5.noarch.rpm"
RPM_HASH = "c2f33111e4bc7c4c02e1427edbe66edbf40141aa60bdda3b9a1f91a6ade48f57b49c6fc32d363ea4535858b3f8ad31b05ebdbf1b1159ada0399c1533fd0f1fa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MouseInfo \
python3.13dist-mouseinfo \
python313-MouseInfo \
python3dist-mouseinfo"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-pyperclip"

inherit rpm
