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

RPM_NAME = "python313-azure-ai-agents-1.1.0-1.4.noarch.rpm"
RPM_HASH = "c936742efd3093748daf7e962df0c09d2ac2f8f0ba26eded822ae10a0f56b5a6aba26f9f6de98609439d04e4b35964ff0262e8b707301ec86b1d0e2e774f9442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-agents \
python3.13dist-azure-ai-agents \
python313-azure-ai-agents \
python3dist-azure-ai-agents"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-typing-extensions"

inherit rpm
