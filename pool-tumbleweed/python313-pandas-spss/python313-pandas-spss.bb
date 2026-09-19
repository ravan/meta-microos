SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-spss-3.0.5-2.2.noarch.rpm"
RPM_HASH = "6c9e3ac3dac9761937ed98d15666b52ab455cb64b718f42d29d6bc904fee23a17976fa7ca8ff29b8b10c5c33f58ec63c944403eff3b24bc64ae41507ff37fa0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-spss \
python313-pandas-spss"

RDEPENDS:${PN} += "python313-pandas \
python313-pyreadstat"

inherit rpm
