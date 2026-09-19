SUMMARY = "A Django App that adds CORS headers to responses"
DESCRIPTION = "A Django App that adds CORS (Cross-Origin Resource Sharing) headers to \
responses."
LICENSE = "MIT"

PV = "4.9.0"

RPM_NAME = "python314-django-cors-headers-4.9.0-1.4.noarch.rpm"
RPM_HASH = "a8be5c6c709043664973c1f6549e98353b3e2375dd579d0c571c02067a02ce7ddc24514bf67a59da3dd9de80a508e0558507b2540ccc6fb4defaf02c0633d578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-cors-headers \
python314-django-cors-headers \
python3dist-django-cors-headers"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
