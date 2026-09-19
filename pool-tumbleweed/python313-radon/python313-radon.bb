SUMMARY = "Code Metrics in Python"
DESCRIPTION = "Radon is a Python tool that computes various metrics from the source code. \
Radon can compute: \
 \
* McCabe's complexity**, i.e. cyclomatic complexity \
* raw metrics (these include SLOC, comment lines, blank lines, &c.) \
* Halstead metrics (all of them) \
* Maintainability Index (the one used in Visual Studio)"
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python313-radon-6.0.1-2.4.noarch.rpm"
RPM_HASH = "bc728eb5da9068e763b32a9cb9a45971ea8bcad351ccce7f796e513e18ede2ba086aae3e7576b65483893639abef1e9b1e3884de7cf580df6d199ac2d82cc01b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-radon \
python3.13dist-radon \
python313-radon \
python3dist-radon"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-colorama \
python313-mando \
update-alternatives"

inherit rpm
