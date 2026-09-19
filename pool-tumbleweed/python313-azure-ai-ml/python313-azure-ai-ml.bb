SUMMARY = "Microsoft Azure Machine Learning Client Library for Python"
DESCRIPTION = "We are excited to introduce the public preview of Azure Machine Learning Python \
SDK v2. The Python SDK v2 introduces new SDK capabilities like standalone local \
jobs, reusable components for pipelines and managed online/batch inferencing. \
Python SDK v2 allows you to move from simple to complex tasks easily and \
incrementally. This is enabled by using a common object model which brings \
concept reuse and consistency of actions across various tasks. The SDK v2 shares \
its foundation with the CLI v2 which is currently in also in public preview. \
 \
This package has been tested with Python 3.6, 3.7, 3.8, 3.9 and 3.10."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python313-azure-ai-ml-1.13.0-2.7.noarch.rpm"
RPM_HASH = "5900e7cb09261d7e649f12eec4507c56a514400cf2c78d42c0aa26e96ebccc12555c96ccaef798a50e22992413ae609b7538c2809d1db18fc8e7f883c5f132ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-ml \
python3.13dist-azure-ai-ml \
python313-azure-ai-ml \
python3dist-azure-ai-ml"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-PyYAML \
python313-applicationinsights \
python313-azure-ai-nspkg \
python313-azure-common \
python313-azure-core \
python313-azure-identity \
python313-azure-mgmt-core \
python313-azure-storage-blob \
python313-azure-storage-file-datalake \
python313-azure-storage-file-share \
python313-colorama \
python313-docker \
python313-isodate \
python313-jsonschema \
python313-marshmallow \
python313-msrest \
python313-pathspec \
python313-pydash \
python313-strictyaml \
python313-tqdm \
python313-typing-extensions"

inherit rpm
