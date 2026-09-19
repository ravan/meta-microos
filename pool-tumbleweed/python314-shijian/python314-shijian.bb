SUMMARY = "Python utility functions relating to time and filenames"
DESCRIPTION = "A Python module with a number of utility functions for formatting \
timestamps, counting time, and deriving non-overlapping filenames or \
sequences."
LICENSE = "GPL-3.0-only"

PV = "2023.10.19.215"

RPM_NAME = "python314-shijian-2023.10.19.215-2.5.noarch.rpm"
RPM_HASH = "7ea3125058894397bc03157a4ac398c34b44ae0b04e80b06382b502402edec84b5270d1114bd292fe3f6728d7b9978279bddec1da75fd959c8fc25e0af263514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-shijian \
python314-shijian \
python3dist-shijian"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy \
python314-pandas \
python314-python-dateutil \
python314-scikit-learn \
python314-scipy \
python314-seaborn \
python314-technicolor"

inherit rpm
