SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "a770dc6a10cd52bdc23f3f3f9232948e05cf665f6782dd367ddd67879f3c85b31c9a8eb648946dc208349fb0893bf7f0a5ad0a18fa40f9f2c9d788a3dddaaaa5"

RPROVIDES:${PN} += "python3.14dist-matplotlib \
python314-matplotlib \
python314-matplotlib-gtk \
python3dist-matplotlib"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-Cycler \
python314-FontTools \
python314-Pillow \
python314-contourpy \
python314-kiwisolver \
python314-numpy \
python314-packaging \
python314-pyparsing \
python314-python-dateutil"

inherit rpm
