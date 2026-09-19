SUMMARY = "MRCZ meta-compressed image file-format library"
DESCRIPTION = "mrcz is a package designed to supplement the venerable MRC image file \
format with a highly efficient compressed variant, using the blosc \
meta-compressor library to shrink files on disk and greatly accelerate \
file input/output for the era of 'Big Data' in electron and optical \
microscopy."
LICENSE = "BSD-3-Clause"

PV = "0.5.9"

RPM_NAME = "python313-mrcz-0.5.9-1.4.noarch.rpm"
RPM_HASH = "d57b08e8e38f62032bf6d8ab8cadb3643c55ac798a1b546fc8d518689ae4ea4097075089fe72a22e836937352f1e8260ad9699ec87cb06483f903b80062881ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mrcz \
python3.13dist-mrcz \
python313-mrcz \
python3dist-mrcz"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
