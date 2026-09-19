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

RPM_NAME = "python314-azure-ai-projects-1.0.0-1.4.noarch.rpm"
RPM_HASH = "ee55620dd57bca99711eeb09ba13eadb3565583056b7f75282c30844bbf66e66d70bd0ae4055cf16628271019aee7295bacfaf847e77490a2ce8bd6e5d5888cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-projects \
python314-azure-ai-projects \
python3dist-azure-ai-projects"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-ai-agents \
python314-azure-storage-blob \
python314-typing-extensions"

inherit rpm
