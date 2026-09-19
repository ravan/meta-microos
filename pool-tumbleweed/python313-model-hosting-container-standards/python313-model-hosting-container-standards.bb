SUMMARY = "Python toolkit for standardized model hosting container implementations"
DESCRIPTION = "A standardized Python framework for seamless integration between ML \
frameworks (TensorRT-LLM, vLLM) and Amazon SageMaker hosting. It provides \
unified /ping and /invocations handler endpoints, flexible configuration via \
environment variables or decorators, automatic dependency installation, and \
supervisor process management for model hosting containers."
LICENSE = "Apache-2.0"

PV = "0.1.16"

RPM_NAME = "python313-model-hosting-container-standards-0.1.16-1.1.noarch.rpm"
RPM_HASH = "cefe7bcf00f935764ebba78b8781da5571745c7284fc9af02034f7e8e30e9a34f32fa3b945cc6bf00bfc1a3dfabbfbd90b207e0cc12365ae618100b0a61e3aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-model-hosting-container-standards \
python3.13dist-model-hosting-container-standards \
python313-model-hosting-container-standards \
python3dist-model-hosting-container-standards"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-fastapi \
python313-httpx \
python313-jmespath \
python313-pydantic \
python313-setuptools \
python313-starlette \
supervisor \
update-alternatives"

inherit rpm
