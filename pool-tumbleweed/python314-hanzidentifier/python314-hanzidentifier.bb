SUMMARY = "Python module that identifies Chinese text as Simplified or Traditional"
DESCRIPTION = "Python module that identifies Chinese text as Simplified or Traditional."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-hanzidentifier-1.3.0-1.8.noarch.rpm"
RPM_HASH = "61c8da982ce1b59534c89a47ac96aad101dafefc94fb91f19cb08e8186882a67ae1e31c56762364c33af2c470533c0e38cd9413f3c77ab868b9c2d978143e82a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hanzidentifier \
python314-hanzidentifier \
python3dist-hanzidentifier"

RDEPENDS:${PN} += "python-abi \
python314-zhon"

inherit rpm
