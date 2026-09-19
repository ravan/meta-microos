SUMMARY = "Pytest plugin to help with comparing array output from tests"
DESCRIPTION = "This is a py.test plugin to facilitate the generation and comparison of \
data arrays produced during tests. \
 \
The basic idea is that you can write a test that generates a Numpy array (or \
other related objects depending on the format). You can then either run the \
tests in a mode to generate reference files from the arrays, or you can run \
the tests in comparison mode, which will compare the results of the tests to \
the reference ones within some tolerance. \
 \
At the moment, the supported file formats for the reference files are: \
 \
-  A plain text-based format (baSed on Numpy loadtxt output) \
-  The FITS format (requires astropy). With this format, tests \
   can return either a Numpy array for a FITS HDU object."
LICENSE = "BSD-2-Clause"

PV = "0.7.0"

RPM_NAME = "python313-pytest-arraydiff-0.7.0-1.2.noarch.rpm"
RPM_HASH = "04d405f9b653a4bab2d4588e547d1a58eaf5c59ddb9dc566feb9e63d384d4b2fe103c855922cb433d9937ccfb4bc48410de3b0e455c0d56f060da06ece948b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-arraydiff \
python3.13dist-pytest-arraydiff \
python313-pytest-arraydiff \
python3dist-pytest-arraydiff"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-pytest"

inherit rpm
