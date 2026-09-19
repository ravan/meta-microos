SUMMARY = "MRCZ meta-compressed image file-format library"
DESCRIPTION = "mrcz is a package designed to supplement the venerable MRC image file \
format with a highly efficient compressed variant, using the blosc \
meta-compressor library to shrink files on disk and greatly accelerate \
file input/output for the era of 'Big Data' in electron and optical \
microscopy."
LICENSE = "BSD-3-Clause"

PV = "0.5.9"

RPM_NAME = "python314-mrcz-0.5.9-1.4.noarch.rpm"
RPM_HASH = "12acb64d78499feecb6d15fdd3eaafe5666eea78e4249f398e6daecbf105f260ae781571cc62bd85d487d07f710b03c7f184a33144993e503e2aed9b1c38b6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mrcz \
python314-mrcz \
python3dist-mrcz"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
