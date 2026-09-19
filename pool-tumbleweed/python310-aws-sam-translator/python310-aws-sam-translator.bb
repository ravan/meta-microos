SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.71.0"

RPM_NAME = "python310-aws-sam-translator-1.71.0-1.1.noarch.rpm"
RPM_HASH = "cd446107611085d339353e67b9d1bf091cc106ab822b6797332f07f5620b5e86267db5f631b47325cb83e0a3b0c2db35b5aca0d85518bf4f439d28e1c2af20d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aws-sam-translator \
python310-aws-sam-translator \
python3dist-aws-sam-translator"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-boto3 \
python310-jsonschema \
python310-pydantic \
update-alternatives"

inherit rpm
