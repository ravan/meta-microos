SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python314-PasteDeploy-3.1.0-1.5.noarch.rpm"
RPM_HASH = "1134998a4ff7d422019fbcf2b6846b2a6e4f94229f0439582190b64e92df75e379bd98de64abdcb5dc5149d127276389c988b5a1acbf153f37fd2d9a02428d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pastedeploy \
python314-PasteDeploy \
python314-pastedeploy \
python3dist-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python314-Paste \
python314-setuptools"

inherit rpm
