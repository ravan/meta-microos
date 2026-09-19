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

RPM_NAME = "python313-lmfit-1.3.4-1.5.noarch.rpm"
RPM_HASH = "0cc5558ae69dfbc6102c8cb2a2c596c7e3f32d1608c3574b756084798dd2bef18ec3b720e4ce92df917e8fae33dbfe5df927d9c532f15ac9ec4fab6e50b5988c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lmfit \
python3.13dist-lmfit \
python313-lmfit \
python3dist-lmfit"

RDEPENDS:${PN} += "python-abi \
python313-asteval \
python313-dill \
python313-numpy \
python313-scipy \
python313-uncertainties"

inherit rpm
