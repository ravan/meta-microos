SUMMARY = "Python utility functions relating to time and filenames"
DESCRIPTION = "A Python module with a number of utility functions for formatting \
timestamps, counting time, and deriving non-overlapping filenames or \
sequences."
LICENSE = "GPL-3.0-only"

PV = "2023.10.19.215"

RPM_NAME = "python313-shijian-2023.10.19.215-2.5.noarch.rpm"
RPM_HASH = "5d4bf667a750b608755445ae0448d8bc87a01b0ba3f4870b65f86cdcef8242b9a0ee2a0d14ab3b822273483d965093c8337fd099e6999c3f37a20d25e3f4b04f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shijian \
python3.13dist-shijian \
python313-shijian \
python3dist-shijian"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy \
python313-pandas \
python313-python-dateutil \
python313-scikit-learn \
python313-scipy \
python313-seaborn \
python313-technicolor"

inherit rpm
