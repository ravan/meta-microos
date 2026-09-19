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

RPM_NAME = "python314-azure-ai-ml-1.13.0-2.7.noarch.rpm"
RPM_HASH = "6cd73b0603a4b229fc534504e86faa2cf93f5a0628656ee080485268226fcfaaba7d3ca6abe8a80ddf719bc458549b777965385f42b4e605a8b07e85aa57483d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-ml \
python314-azure-ai-ml \
python3dist-azure-ai-ml"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-PyYAML \
python314-applicationinsights \
python314-azure-ai-nspkg \
python314-azure-common \
python314-azure-core \
python314-azure-identity \
python314-azure-mgmt-core \
python314-azure-storage-blob \
python314-azure-storage-file-datalake \
python314-azure-storage-file-share \
python314-colorama \
python314-docker \
python314-isodate \
python314-jsonschema \
python314-marshmallow \
python314-msrest \
python314-pathspec \
python314-pydash \
python314-strictyaml \
python314-tqdm \
python314-typing-extensions"

inherit rpm
