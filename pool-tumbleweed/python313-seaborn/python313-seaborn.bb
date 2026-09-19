SUMMARY = "Statistical data visualization for python"
DESCRIPTION = "Seaborn is a library for making attractive and informative \
statistical graphics in Python. It is built on top of \
matplotlib and tightly integrated with the PyData stack, \
including support for numpy and pandas data structures and \
statistical routines from scipy and statsmodels. \
 \
Some of the features that seaborn offers are: \
- Several built-in themes that improve on the default matplotlib \
  aesthetics \
- Tools for choosing color palettes to make beautiful plots that \
  reveal patterns in your data \
- Functions for visualizing univariate and bivariate distributions \
  or for comparing them between subsets of data \
- Tools that fit and visualize linear regression models for different \
  kinds of independent and dependent variables \
- Functions that visualize matrices of data and use clustering \
  algorithms to discover structure in those matrices \
- A function to plot statistical timeseries data with flexible \
  estimation and representation of uncertainty around the estimate \
- High-level abstractions for structuring grids of plots that let you \
  easily build complex visualizations"
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "0.13.2"

RPM_NAME = "python313-seaborn-0.13.2-6.1.noarch.rpm"
RPM_HASH = "2b4b1ad1c73f265fed411fb5a6b52cd5af8dfaeb88acd8241b012152abe71c388271ff2dddfc942f88b439fe05e8e3d1a02843502650cd0693f30092e2a9aa5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-seaborn \
python3.13dist-seaborn \
python313-seaborn \
python3dist-seaborn"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy \
python313-pandas"

inherit rpm
