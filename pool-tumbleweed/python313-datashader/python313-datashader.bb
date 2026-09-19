SUMMARY = "Data visualization toolchain based on aggregating into a grid"
DESCRIPTION = "Traditional visualization systems treat plotting as a unitary process \
transforming incoming data into an onscreen or printed image, with \
parameters that can be specified beforehand that affect the final \
result.  While this approach works for small collections of data that \
can be viewed in their entirety, the visualization for large datasets \
is often the only way to understand what the data consists of, and \
there is no objective way to set the parameters to reveal this data. \
 \
The datashader library breaks up the rendering pipeline into a series \
of stages where user-defined computations can be performed, allowing \
the visualization to adapt to and reveal the underlying properties of \
the dataset, i.e. the datashader pipeline allows computation *on \
the visualization*, not just on the dataset, allowing it to do \
automatic ranging and scaling that takes the current visualization \
constraints into account.  For instance, where a traditional system \
would use a transparency/opacity parameter to show the density of \
overlapping points in a scatterplot, datashader can automatically \
calculate how many datapoints are mapped to each pixel, scaling the \
representation to accurately convey the data at every location, with no \
saturation, overplotting, or underplotting issues."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "python313-datashader-0.19.1-1.3.noarch.rpm"
RPM_HASH = "d3f6c9fc286d0933108b97465a2856942c588eb0a684d730245b0bed2c95247182c1d88233ecf0f84c2a932a325323ccc4397f1eb1f2acfdef15bfad665cf1ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-datashader \
python3.13dist-datashader \
python313-datashader \
python3dist-datashader"

RDEPENDS:${PN} += "python-abi \
python313-colorcet \
python313-multipledispatch \
python313-numba \
python313-numpy \
python313-packaging \
python313-pandas \
python313-param \
python313-pyct \
python313-requests \
python313-scipy \
python313-toolz \
python313-xarray"

inherit rpm
