SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "python313-pyarrow-devel-25.0.0-1.1.aarch64.rpm"
RPM_HASH = "040ef9f01ca347160633eda9eed6361eb7b010a40e600349bbdfea7a21193acbfa640ee86752728853587e43e28ec77553dc8e4c00e124d970806d14f7de2d2c"

RPROVIDES:${PN} += "python3-pyarrow-devel \
python313-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python313-Cython \
python313-pyarrow"

inherit rpm
