SUMMARY = "Ollama python bindings"
DESCRIPTION = "Official ollama python bindings"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python313-ollama-0.6.2-1.3.noarch.rpm"
RPM_HASH = "e61ae0c98d116686f92f9bf3ac94883c36d0b04385570bb2fc4221dfa8ff0b7013339694f47711729db0dabacec8d02643c414ee116f024c1b2cff4af138138b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ollama \
python3.13dist-ollama \
python313-ollama \
python3dist-ollama"

RDEPENDS:${PN} += "python-abi \
python313-httpx \
python313-pydantic"

inherit rpm
