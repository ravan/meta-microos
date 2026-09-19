SUMMARY = "Microsoft Azure AI Projects Client Library for Python"
DESCRIPTION = "The AI Projects client library (in preview) is part of the Azure AI Foundry \
SDK, and provides easy access to resources in your Azure AI Foundry Project. \
 \
Use it to: \
 \
 * Create and run Agents using methods on the .agents client property. \
 * Get an AzureOpenAI client using the .get_openai_client() client method. \
 * Enumerate AI Models deployed to your Foundry Project using methods \
   on the .deployments client property. \
 * Enumerate connected Azure resources in your Foundry project using methods \
   on the .connections client property. \
 * Upload documents and create Datasets to reference them using methods on \
   the .datasets client property. \
 * Create and enumerate Search Indexes using methods on the .indexes client property. \
 \
The client library uses version v1 of the AI Foundry data plane REST APIs."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-ai-projects-1.0.0-1.4.noarch.rpm"
RPM_HASH = "39121b18c52296a71959918dd8e9d33ac49fbe6c6cd353eb987e47103ed0f01ae9947d4e88614bee903d1c07ce7b2359b2e0abf90afdf5d8f7432dcf8b533fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-projects \
python3.13dist-azure-ai-projects \
python313-azure-ai-projects \
python3dist-azure-ai-projects"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-ai-agents \
python313-azure-storage-blob \
python313-typing-extensions"

inherit rpm
