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

RPM_NAME = "python314-pytest-arraydiff-0.7.0-1.2.noarch.rpm"
RPM_HASH = "47e736a570e621ea6e950d7b57d66ed32518a7a8ce4a340e9c9fbbf0a8535abdd5f962af0b286b8bbabaa1929157df4f69495708778a7ad44225d082f26ba4c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-arraydiff \
python314-pytest-arraydiff \
python3dist-pytest-arraydiff"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-pytest"

inherit rpm
