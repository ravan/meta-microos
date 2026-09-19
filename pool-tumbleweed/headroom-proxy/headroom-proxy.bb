SUMMARY = "HTTP/MCP proxy extra for Headroom"
DESCRIPTION = "Runtime extra matching pip install headroom-ai[proxy]: FastAPI/uvicorn \
HTTP+MCP proxy, Magika content routing, ONNX Runtime, and sqlite-vec \
(--memory). Stock 'headroom proxy' and 'headroom wrap' refuse to start \
without this set."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "0.37.0"

RPM_NAME = "headroom-proxy-0.37.0-1.1.noarch.rpm"
RPM_HASH = "6d71c9e7f0c78c6a95a5e757e9176d3605a2d1649d3b8629bad75cce455b80ec78344303bcbe2a9341201bf6541c0f862dfc58329cb9a3f47b71d62bbdebd9ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "headroom-proxy"

RDEPENDS:${PN} += "headroom \
python313-fastapi \
python313-h2 \
python313-httpx \
python313-magika \
python313-mcp \
python313-onnxruntime \
python313-openai \
python313-orjson \
python313-sqlite-vec \
python313-transformers \
python313-uvicorn \
python313-watchdog \
python313-websockets \
python313-zstandard"

inherit rpm
