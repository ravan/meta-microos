SUMMARY = "An open-source, code-first Python toolkit for building AI agents"
DESCRIPTION = "An open-source, code-first Python toolkit for building, evaluating, and deploying sophisticated AI agents with flexibility and control."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python313-google-adk-2.2.0-1.2.noarch.rpm"
RPM_HASH = "977af658ecbb58f203ae7263473589ccf3cb37d08780acd99e60bb02fb44ba5cdab67509fd5daecf349824e27a3abc6e3228f6eecbbd110f78c32c0552fa5ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-adk \
python3.13dist-google-adk \
python313-google-adk \
python3dist-google-adk"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Authlib \
python313-PyYAML \
python313-aiosqlite \
python313-anyio \
python313-click \
python313-fastapi \
python313-google-api-python-client \
python313-google-auth \
python313-google-cloud-aiplatform \
python313-google-cloud-bigquery \
python313-google-cloud-bigquery-storage \
python313-google-cloud-bigtable \
python313-google-cloud-dataplex \
python313-google-cloud-discoveryengine \
python313-google-cloud-pubsub \
python313-google-cloud-secret-manager \
python313-google-cloud-spanner \
python313-google-cloud-speech \
python313-google-cloud-storage \
python313-google-genai \
python313-graphviz \
python313-httpx \
python313-jsonschema \
python313-mcp \
python313-opentelemetry-api \
python313-opentelemetry-exporter-gcp-logging \
python313-opentelemetry-exporter-gcp-monitoring \
python313-opentelemetry-exporter-gcp-trace \
python313-opentelemetry-exporter-otlp-proto-http \
python313-opentelemetry-resourcedetector-gcp \
python313-opentelemetry-sdk \
python313-pydantic \
python313-python-dateutil \
python313-python-dotenv \
python313-python-multipart \
python313-requests \
python313-sqlalchemy \
python313-sqlalchemy-spanner \
python313-starlette \
python313-tenacity \
python313-typing-extensions \
python313-tzlocal \
python313-uvicorn \
python313-watchdog \
python313-websockets \
update-alternatives"

inherit rpm
