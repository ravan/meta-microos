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

RPM_NAME = "python313-drf-standardized-errors-0.16.0-1.2.noarch.rpm"
RPM_HASH = "c7b3bb7235ab54503f8665bc8f6c7e95c6f45fcb47d91eaa9d02d8638200418a7184207dbac01791dc88eb0f831b5b270ee46488087dd3a7d656be82b49615d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-drf-standardized-errors \
python3.13dist-drf-standardized-errors \
python313-drf-standardized-errors \
python3dist-drf-standardized-errors"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-djangorestframework"

inherit rpm
