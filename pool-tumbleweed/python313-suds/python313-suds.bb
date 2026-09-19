SUMMARY = "Lightweight SOAP client"
DESCRIPTION = "Suds is a lightweight SOAP-based web service client for Python. \
 \
Although the original suds package stopped releasing versions after \
0.4, many (but not all) other open source projects moved to a \
maintained fork known as 'suds-jurko'. This is a community fork of \
that fork that is releasing packages under the main suds package name \
(and suds-community for consistency until version 2.x of this \
package)."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "python313-suds-1.2.0-4.4.noarch.rpm"
RPM_HASH = "b7eded85a93269c4486775ba2de56b3e1e46ec4bdac926d1ffb0bddbd55e4b2f6d6fb3006c1f1857037bf6e2c3c5f4efd35c9e9ef8840212e8311f1d61258b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-suds \
python3-suds-community \
python3-suds-jurko \
python3.13dist-suds-community \
python313-suds \
python313-suds-community \
python313-suds-jurko \
python3dist-suds-community"

RDEPENDS:${PN} += "python-abi"

inherit rpm
