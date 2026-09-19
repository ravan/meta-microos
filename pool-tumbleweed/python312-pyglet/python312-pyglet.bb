SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.10"

RPM_NAME = "python312-pyglet-2.0.10-1.7.noarch.rpm"
RPM_HASH = "26053eadd3af54f4322ea6f5eced9e376f76952bfce09966ee1cb4ae742ddb28878d6e08b0294e88f744834386d3baec6fb96a9baf49c2b2da6805d188a909a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-pyglet \
python312-pyglet \
python3dist-pyglet"

RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python-abi \
python312-Pillow \
python312-pypng"

inherit rpm
