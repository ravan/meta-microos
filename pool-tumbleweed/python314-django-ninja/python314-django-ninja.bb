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

RPM_NAME = "python314-django-ninja-1.6.3-1.1.noarch.rpm"
RPM_HASH = "3878bfccdf84e796928f0df908c07459c70e781fb8f8c180c95eea97601ad05d26245d45fad99ba797704a6bee1215e84904ceceac213b4f321491863d0520e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-ninja \
python314-django-ninja \
python3dist-django-ninja"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-pydantic"

inherit rpm
