SUMMARY = "Least-Squares Minimization with Bounds and Constraints"
DESCRIPTION = "A library for least-squares minimization and data fitting in \
Python.  Built on top of scipy.optimize, lmfit provides a Parameter object \
which can be set as fixed or free, can have upper and/or lower bounds, or \
can be written in terms of algebraic constraints of other Parameters.  The \
user writes a function to be minimized as a function of these Parameters, \
and the scipy.optimize methods are used to find the optimal values for the \
Parameters.  The Levenberg-Marquardt (leastsq) is the default minimization \
algorithm, and provides estimated standard errors and correlations between \
varied Parameters.  Other minimization methods, including Nelder-Mead's \
downhill simplex, Powell's method, BFGS, Sequential Least Squares, and \
others are also supported.  Bounds and constraints can be placed on \
Parameters for all of these methods. \
 \
In addition, methods for explicitly calculating confidence intervals are \
provided for exploring minmization problems where the approximation of \
estimating Parameter uncertainties from the covariance matrix is \
questionable."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.3.4"

RPM_NAME = "python314-lmfit-1.3.4-1.5.noarch.rpm"
RPM_HASH = "2d12cb1667874a14afc85925b9d783e7dc9da32204e4addd6f92e35ccbb343ba400c316eb0cdf1c36abfd3e989d73cf23ce50baa058af69c33db296b946b2308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lmfit \
python314-lmfit \
python3dist-lmfit"

RDEPENDS:${PN} += "python-abi \
python314-asteval \
python314-dill \
python314-numpy \
python314-scipy \
python314-uncertainties"

inherit rpm
