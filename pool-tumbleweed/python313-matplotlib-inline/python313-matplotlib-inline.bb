SUMMARY = "Inline Matplotlib backend for Jupyter"
DESCRIPTION = "Matplotlib Inline Back-end for IPython and Jupyter"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python313-matplotlib-inline-0.2.1-1.4.noarch.rpm"
RPM_HASH = "4827517083ccc127517de902d4b3a257cac679c272999910f4cafe1e47c8c9e57f89318f3902088bcdb34d667b77775eddf0afd002db9d474de36ad232703b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matplotlib-inline \
python3.13dist-matplotlib-inline \
python313-matplotlib-inline \
python3dist-matplotlib-inline"

RDEPENDS:${PN} += "python-abi \
python313-traitlets"

inherit rpm
