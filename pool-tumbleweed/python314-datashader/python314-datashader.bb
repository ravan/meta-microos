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

RPM_NAME = "python314-datashader-0.19.1-1.3.noarch.rpm"
RPM_HASH = "ebe1f33579bdd48a5012f92217d3d42038ef5629dbe1b96f48b96b58bf2f0122d3812776d81ec6b623c0837e56b1dfb601b9276dd2c8da23094bfe8e411f9137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-datashader \
python314-datashader \
python3dist-datashader"

RDEPENDS:${PN} += "python-abi \
python314-colorcet \
python314-multipledispatch \
python314-numba \
python314-numpy \
python314-packaging \
python314-pandas \
python314-param \
python314-pyct \
python314-requests \
python314-scipy \
python314-toolz \
python314-xarray"

inherit rpm
