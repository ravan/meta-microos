SUMMARY = "Microsoft Corporation Azure AI Agents Client Library for Python"
DESCRIPTION = "Use the AI Agents client library to: \
 \
 * Develop Agents using the Azure AI Agents Service, leveraging an extensive ecosystem \
   of models, tools, and capabilities from OpenAI, Microsoft, and other LLM providers. \
   The Azure AI Agents Service enables the building of Agents for a wide range of \
   generative AI use cases. \
 * Note: While this package can be used independently, we recommend using the Azure AI \
   Projects client library (azure-ai-projects) for an enhanced experience. The Projects \
   library provides simplified access to advanced functionality, such as creating and \
   managing agents, enumerating AI models, working with datasets and managing search \
   indexes, evaluating generative AI performance, and enabling OpenTelemetry tracing."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-ai-agents-1.1.0-1.4.noarch.rpm"
RPM_HASH = "19f1020676111ae4f4170699ff71fb6dc40e04916657a8d9683e62119d4007fcb6bf28026dd09fa0dba6822107865b3d209a07b14d4b822cf0db9e5eae8fb950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-agents \
python314-azure-ai-agents \
python3dist-azure-ai-agents"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-typing-extensions"

inherit rpm
