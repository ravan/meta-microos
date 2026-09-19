SUMMARY = "An open-source, code-first Python toolkit for building AI agents"
DESCRIPTION = "An open-source, code-first Python toolkit for building, evaluating, and deploying sophisticated AI agents with flexibility and control."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python314-google-adk-2.2.0-1.2.noarch.rpm"
RPM_HASH = "220b05f1703873a22f747b320d2a1ae90c5acd19f1fb1090350a515321bcb5ca9cdb23ad3c89daafb056e3ef95a7bd1782034f9a55d43dd06106eeeb94e1cf3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-adk \
python314-google-adk \
python3dist-google-adk"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Authlib \
python314-PyYAML \
python314-aiosqlite \
python314-anyio \
python314-click \
python314-fastapi \
python314-google-api-python-client \
python314-google-auth \
python314-google-cloud-aiplatform \
python314-google-cloud-bigquery \
python314-google-cloud-bigquery-storage \
python314-google-cloud-bigtable \
python314-google-cloud-dataplex \
python314-google-cloud-discoveryengine \
python314-google-cloud-pubsub \
python314-google-cloud-secret-manager \
python314-google-cloud-spanner \
python314-google-cloud-speech \
python314-google-cloud-storage \
python314-google-genai \
python314-graphviz \
python314-httpx \
python314-jsonschema \
python314-mcp \
python314-opentelemetry-api \
python314-opentelemetry-exporter-gcp-logging \
python314-opentelemetry-exporter-gcp-monitoring \
python314-opentelemetry-exporter-gcp-trace \
python314-opentelemetry-exporter-otlp-proto-http \
python314-opentelemetry-resourcedetector-gcp \
python314-opentelemetry-sdk \
python314-pydantic \
python314-python-dateutil \
python314-python-dotenv \
python314-python-multipart \
python314-requests \
python314-sqlalchemy \
python314-sqlalchemy-spanner \
python314-starlette \
python314-tenacity \
python314-typing-extensions \
python314-tzlocal \
python314-uvicorn \
python314-watchdog \
python314-websockets \
update-alternatives"

inherit rpm
