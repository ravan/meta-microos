SUMMARY = "A collection of Matplotlib colormaps from the yt project"
DESCRIPTION = "Matplotlib colormaps from the yt project !"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python313-cmyt-2.0.2-1.3.noarch.rpm"
RPM_HASH = "ba78b68b75f11d32963315a11c746a0048e37b9d73aaffc2bc2c4d9878b860d4583b3ab486cb75fbc98d8b830ccddb472b46ee2971ebe6b58ffb63cf05fa9daa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmyt \
python3.13dist-cmyt \
python313-cmyt \
python3dist-cmyt"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy"

inherit rpm
