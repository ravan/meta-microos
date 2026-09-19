SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "d76e721afa50a4a74095e2e8eefcbef700af06ec1cf87487f3bb910755213e3aa5183eab938d61adb3fc09de87ba2d5fc200b0eac1f04670182c50aeca4341d0"

RPROVIDES:${PN} += "python3-matplotlib \
python3-matplotlib-gtk \
python3.13dist-matplotlib \
python313-matplotlib \
python313-matplotlib-gtk \
python3dist-matplotlib"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-Cycler \
python313-FontTools \
python313-Pillow \
python313-contourpy \
python313-kiwisolver \
python313-numpy \
python313-packaging \
python313-pyparsing \
python313-python-dateutil"

inherit rpm
