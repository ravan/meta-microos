SUMMARY = "Standardize your API error responses"
DESCRIPTION = " \
 \
Standardize your DRF API error responses. \
 \
- Highly customizable: gives you flexibility to define your own standardized error responses and override \
specific aspects the exception handling process without having to rewrite everything. \
- Supports nested serializers and ListSerializer errors \
- Plays nicely with error monitoring tools (like Sentry, ...)"
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python314-drf-standardized-errors-0.16.0-1.2.noarch.rpm"
RPM_HASH = "29f3cda8cc5e7d7c8f4a713f0ec1ecde867c279d1857c48a3d2824ea995a1e37b3fc9bf90a3c3625234e6f35753647cbd52991195c14f82e5b56f7f4cfe9cafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-drf-standardized-errors \
python314-drf-standardized-errors \
python3dist-drf-standardized-errors"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-djangorestframework"

inherit rpm
