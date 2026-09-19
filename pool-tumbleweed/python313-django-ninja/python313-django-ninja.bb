SUMMARY = "Django Ninja - Fast Django REST framework"
DESCRIPTION = "Django Ninja is a web framework for building APIs with Django and \
Python 3.6+ type hints. \
 \
Key features: \
 \
- Easy: Designed to be easy to use and intuitive. \
- FAST execution: Very high performance thanks to Pydantic and async support. \
- Fast to code: Type hints and automatic docs lets you focus only on business \
  logic. \
- Standards-based: Based on the open standards for APIs: OpenAPI (previously \
  known as Swagger) and JSON Schema. \
- Django friendly: (obviously) has good integration with the Django core and \
  ORM. \
- Production ready: Used by multiple companies on live projects"
LICENSE = "MIT"

PV = "1.6.3"

RPM_NAME = "python313-django-ninja-1.6.3-1.1.noarch.rpm"
RPM_HASH = "ead0f6f5a8595a1b540249ac232b5681dfe33d7b42bd17a70ba41b5ee2d3e2e5d9d9871be962d46814e6c56c22659c57be72689dcec4c2c82f554b0b2f528d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-ninja \
python3.13dist-django-ninja \
python313-django-ninja \
python3dist-django-ninja"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-pydantic"

inherit rpm
