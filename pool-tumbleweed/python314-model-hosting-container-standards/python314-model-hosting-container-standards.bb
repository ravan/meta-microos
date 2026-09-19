SUMMARY = "Python toolkit for standardized model hosting container implementations"
DESCRIPTION = "A standardized Python framework for seamless integration between ML \
frameworks (TensorRT-LLM, vLLM) and Amazon SageMaker hosting. It provides \
unified /ping and /invocations handler endpoints, flexible configuration via \
environment variables or decorators, automatic dependency installation, and \
supervisor process management for model hosting containers."
LICENSE = "Apache-2.0"

PV = "0.1.16"

RPM_NAME = "python314-model-hosting-container-standards-0.1.16-1.1.noarch.rpm"
RPM_HASH = "93fbb3f724f302f6bf42c19700e9d40481ab7f2434f52f34311ec766ab150474ba6617eb34996cac00c059d7391907df650baf030efc24ec0fd6e5b7c7589485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-model-hosting-container-standards \
python314-model-hosting-container-standards \
python3dist-model-hosting-container-standards"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-fastapi \
python314-httpx \
python314-jmespath \
python314-pydantic \
python314-setuptools \
python314-starlette \
supervisor \
update-alternatives"

inherit rpm
