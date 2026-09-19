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

RPM_NAME = "python314-seaborn-0.13.2-6.1.noarch.rpm"
RPM_HASH = "c87f3e36898843a5fb1e4a80785b9c172398b9d1ee189977ca25594963a85ceb99f79e35e7834624602998ddd6a978c1add498a55cb13f998842efc27a0b9b73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-seaborn \
python314-seaborn \
python3dist-seaborn"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy \
python314-pandas"

inherit rpm
