SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.71.0"

RPM_NAME = "python39-aws-sam-translator-1.71.0-1.1.noarch.rpm"
RPM_HASH = "24f150d67029f8d1d18edd123cae447528748b1ac66190d3a3d46eb9b691c6c98303def8864a415bcfa87c820b0df2d933149948785ee088763834ab71c6e5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aws-sam-translator \
python39-aws-sam-translator \
python3dist-aws-sam-translator"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-boto3 \
python39-jsonschema \
python39-pydantic \
update-alternatives"

inherit rpm
